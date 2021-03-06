package com.prowidesoftware.swift.model;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Test for {@link MtSwiftMessage} model API
 * 
 * @author sebastian@prowidesoftware.com
 * @since 7.8
 */
public class MtSwiftMessageTest {

	@Test
	public void testGetModelMessage() {
		String fin = "{1:F01CARBVEC0AXXX8321000092}{2:I199BICPDVSAXXXXN}{4:\n"
		        + ":20:ABC\n"
		        + "-}";
		MtSwiftMessage mtsm = new MtSwiftMessage(fin);
		assertNotNull(mtsm.getFileFormat());
		assertEquals(FileFormat.FIN, mtsm.getFileFormat());
		SwiftMessage sm = mtsm.modelMessage();
		assertNotNull(sm);
		assertNotNull(sm.getBlock4());
		assertEquals(1, sm.getBlock4().size());
	}

	@Test
	public void testSystemMessage() {
		String fin = "{1:F21LITEBEBBADSZ0066000079}{4:{177:1104180901}{451:0}}\n"
					+"{1:F01LITEBEBBADSZ0066000079}{2:I999FOOEBEBBXABCN}{4:\n"
					+":20:TESTREF1\n"
					+":79:This is text line 1\n"
					+"-}{5:{CHK:7602B010CF31}{TNG:}}";
		MtSwiftMessage m = new MtSwiftMessage(fin);
		assertEquals(AbstractSwiftMessage.IDENTIFIER_ACK, m.getIdentifier());
		assertEquals("LITEBEBBDSZ", m.getSender());
		/*
		 * data from original message
		 */
		assertEquals(m.getDirection(), MessageIOType.outgoing);
		assertEquals("TESTREF1", m.getReference());
		assertEquals("FOOEBEBBABC", m.getReceiver());
	}
	
	@Test
	public void updateFromIncompleteModel() {
		MtSwiftMessage m = new MtSwiftMessage();
		SwiftMessage sm = new SwiftMessage();
		sm.addBlock(new SwiftBlock1());
		sm.addBlock(new SwiftBlock2Input());
		sm.getBlock2().setMessageType("202");
		m.updateFromModel(sm);
		assertEquals("fin.202", m.getIdentifier());
	}

}
