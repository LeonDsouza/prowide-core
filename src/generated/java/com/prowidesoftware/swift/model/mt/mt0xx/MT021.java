/*******************************************************************************
 * Copyright (c) 2016 Prowide Inc.
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Lesser General Public License as 
 *     published by the Free Software Foundation, either version 3 of the 
 *     License, or (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  
 *     
 *     Check the LGPL at <http://www.gnu.org/licenses/> for more details.
 *******************************************************************************/
package com.prowidesoftware.swift.model.mt.mt0xx;



import com.prowidesoftware.Generated;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.prowidesoftware.swift.model.*;
import com.prowidesoftware.swift.model.field.*;
import com.prowidesoftware.swift.model.mt.AbstractMT;
import com.prowidesoftware.swift.utils.Lib;
import java.io.File;
import java.io.InputStream;
import java.io.IOException;

/**
 * <h1>MT 021 - Retrieval Request</h1>
 * <h3>SWIFT MT021 (ISO 15022) message structure:</h3>
 *
 <div class="scheme"><ul>
<li class="field">Field 202  (M)</li>
<li class="field">Field 203  (M)</li>
<li class="field">Field 280  (M)</li>
<li class="field">Field 108  (O)</li>
<li class="field">Field 431  (O)</li>
<li class="field">Field 281  (O)</li>
<li class="sequence">
Sequence _A - Retrieval message (O)<ul><li class="sequence">
Sequence _A1 - MIR range (O)<ul><li class="field">Field 252  (M)</li>
</ul></li>
<li class="sequence">
Sequence _A2 - MOR range (O)<ul><li class="field">Field 254  (M)</li>
</ul></li>
<li class="sequence">
Sequence _A3 - Message input type (O)<ul><li class="field">Field 255  (M)</li>
<li class="field">Field 152  (O)</li>
</ul></li>
<li class="sequence">
Sequence _A4 - Category input type (O)<ul><li class="field">Field 256  (M)</li>
<li class="field">Field 152  (O)</li>
</ul></li>
<li class="sequence">
Sequence _A5 - Input time range (O)<ul><li class="field">Field 257  (M)</li>
<li class="field">Field 152  (O)</li>
</ul></li>
<li class="sequence">
Sequence _A6 - Message output type (O)<ul><li class="field">Field 258  (M)</li>
<li class="field">Field 153  (O)</li>
</ul></li>
<li class="sequence">
Sequence _A7 - Category output type (O)<ul><li class="field">Field 259  (M)</li>
<li class="field">Field 153  (O)</li>
</ul></li>
<li class="sequence">
Sequence _A8 - Output time range (O)<ul><li class="field">Field 260  (M)</li>
<li class="field">Field 153  (O)</li>
</ul></li>
<li class="sequence">
Sequence _A9 - Reason why the Retrieval Request cannot be satisfied (O)<ul><li class="field">Field 421  (M)</li>
<li class="field">Field 152  (O)</li>
</ul></li>
<li class="sequence">
Sequence _A10 - Reason why the Retrieval Request cannot be satisfied (O)<ul><li class="field">Field 421  (M)</li>
<li class="field">Field 153  (O)</li>
</ul></li>
</ul></li>
<li class="sequence">
Sequence _B - Retrieval Request not satisfied information (O)<ul><li class="field">Field 202  (M)</li>
<li class="field">Field 203  (M)</li>
<li class="field">Field 421  (M)</li>
</ul></li>
</ul></div>

 <style>
.scheme, .scheme ul, .scheme li {
     position: relative;
}
.scheme ul {
    list-style: none;
    padding-left: 32px;
}
.scheme li::before, .scheme li::after {
    content: "";
    position: absolute;
    left: -12px;
}
.scheme li::before {
    border-top: 1px solid #000;
    top: 9px;
    width: 8px;
    height: 0;
}
.scheme li::after {
    border-left: 1px solid #000;
    height: 100%;
    width: 0px;
    top: 2px;
}
.scheme ul > li:last-child::after {
    height: 8px;
}</style>

 *
 * <p>This source code is specific to release <strong>SRU 2017</strong></p> 
 * <p>For additional resources check <a href="http://www.prowidesoftware.com/resources">http://www.prowidesoftware.com/resources</a></p>
 *
 * @author www.prowidesoftware.com
 */
@Generated
public class MT021 extends AbstractMT implements Serializable {
	/**
	 * Constant identifying the SRU to which this class belongs to.
	 */
	public static final int SRU = 2017;
	private static final long serialVersionUID = 1L;
	private static final transient java.util.logging.Logger log = java.util.logging.Logger.getLogger(MT021.class.getName());
	
	/**
	* Constant for MT name, this is part of the classname, after <code>MT</code>
	*/
	public static final String NAME = "021";
	
// begin qualifiers constants	

// end qualifiers constants	

	/**
	 * Creates an MT021 initialized with the parameter SwiftMessage
	 * @param m swift message with the MT021 content
	 */
	public MT021(SwiftMessage m) {
		super(m);
		sanityCheck(m);
	}

	/**
	 * Creates an MT021 initialized with the parameter MtSwiftMessage.
	 * @param m swift message with the MT021 content, the parameter can not be <code>null</code>
	 * @see #MT021(String)
	 */
	public MT021(MtSwiftMessage m) {
		this();
		super.m = super.getSwiftMessageNotNullOrException();
		sanityCheck(super.m);
	}
	
	/**
	 * Creates an MT021 initialized with the parameter MtSwiftMessage.
	 *
	 * @param m swift message with the MT021 content
	 * @return the created object or <code>null</code> if the parameter is <code>null</code>
	 * @see #MT021(String)
	 * @since 7.7
	 */
	public static MT021 parse(MtSwiftMessage m) {
		if (m == null) {
			return null;
		}
		return new MT021(m.message());
	}
	
	/**
	 * Creates and initializes a new MT021 input message setting TEST BICS as sender and receiver.<br />
	 * All mandatory header attributes are completed with default values.
	 *
	 * @since 7.6
	 */
	public MT021() {
		this(BIC.TEST8, BIC.TEST8);
	}
	
	/**
	 * Creates and initializes a new MT021 input message from sender to receiver.<br />
	 * All mandatory header attributes are completed with default values. 
	 * In particular the sender and receiver addresses will be filled with proper default LT identifier 
	 * and branch codes if not provided,
	 * 
	 * @param sender the sender address as a bic8, bic11 or full logical terminal consisting of 12 characters
	 * @param receiver the receiver address as a bic8, bic11 or full logical terminal consisting of 12 characters
	 * @since 7.7
	 */
	public MT021(final String sender, final String receiver) {
		super(21, sender, receiver);
	}
	
	/**
	* <em>DO NOT USE THIS METHOD</em>
	* It is kept for compatibility but will be removed very soon, since the
	* <code>messageType</code> parameter is actually ignored.
	* 
	* @see #MT021(String, String)
	* @deprecated Use instead <code>new MT021(sender, receiver)</code> instead
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public MT021(final int messageType, final String sender, final String receiver) {
		super(21, sender, receiver);
		com.prowidesoftware.deprecation.DeprecationUtils.phase2(getClass(), "MT021(int, String, String)", "Use the constructor MT021(sender, receiver) instead.");
	}
	
	/**
	 * Creates a new MT021 by parsing a String with the message content in its swift FIN format.<br />
	 * If the fin parameter is null or the message cannot be parsed, the internal message object
	 * will be initialized (blocks will be created) but empty.<br />
	 * If the string contains multiple messages, only the first one will be parsed.
	 *
	 * @param fin a string with the MT message in its FIN swift format
	 * @since 7.7
	 */
	public MT021(final String fin) {
		super();
		if (fin != null) {
			final SwiftMessage parsed = read(fin);
			if (parsed != null) {
				super.m = parsed;
				sanityCheck(parsed);
			}
		}
    }
    
    private void sanityCheck(final SwiftMessage param) {
    	if (param.isServiceMessage()) {
			log.warning("Creating an MT021 object from FIN content with a Service Message. Check if the MT021 you are intended to read is prepended with and ACK.");
		} else if (!StringUtils.equals(param.getType(), getMessageType())) {
			log.warning("Creating an MT021 object from FIN content with message type "+param.getType());
		}
    }
	
	/**
	 * Creates a new MT021 by parsing a String with the message content in its swift FIN format.<br />
	 * If the fin parameter cannot be parsed, the returned MT021 will have its internal message object
	 * initialized (blocks will be created) but empty.<br />
	 * If the string contains multiple messages, only the first one will be parsed. 
	 *
	 * @param fin a string with the MT message in its FIN swift format. <em>fin may be <code>null</code> in which case this method returns null</em>
	 * @return a new instance of MT021 or null if fin is null 
	 * @since 7.7
	 */
	public static MT021 parse(final String fin) {
		if (fin == null) {
			return null;
		}
		return new MT021(fin);
    }
    
    /**
	 * Creates a new MT021 by parsing a input stream with the message content in its swift FIN format, using "UTF-8" as encoding.<br />
	 * If the message content is null or cannot be parsed, the internal message object
	 * will be initialized (blocks will be created) but empty.<br />
	 * If the stream contains multiple messages, only the first one will be parsed.
	 *
	 * @param stream an input stream in UTF-8 encoding with the MT message in its FIN swift format.
	 * @since 7.7
	 */
	public MT021(final InputStream stream) throws IOException {
		this(Lib.readStream(stream));
    }
    
    /**
	 * Creates a new MT021 by parsing a input stream with the message content in its swift FIN format, using "UTF-8" as encoding.<br />
	 * If the stream contains multiple messages, only the first one will be parsed.
	 *
	 * @param stream an input stream in UTF-8 encoding with the MT message in its FIN swift format.
	 * @return a new instance of MT021 or null if stream is null or the message cannot be parsed 
	 * @since 7.7
	 */
	public static MT021 parse(final InputStream stream) throws IOException {
		if (stream == null) {
			return null;
		}
		return new MT021(stream);
    }
    
    /**
	 * Creates a new MT021 by parsing a file with the message content in its swift FIN format.<br />
	 * If the file content is null or cannot be parsed as a message, the internal message object
	 * will be initialized (blocks will be created) but empty.<br />
	 * If the file contains multiple messages, only the first one will be parsed.
	 *
	 * @param file a file with the MT message in its FIN swift format.
	 * @since 7.7
	 */
	public MT021(final File file) throws IOException {
		this(Lib.readFile(file));
    }
    
    /**
	 * Creates a new MT021 by parsing a file with the message content in its swift FIN format.<br />
	 * If the file contains multiple messages, only the first one will be parsed.
	 *
	 * @param file a file with the MT message in its FIN swift format.
	 * @return a new instance of MT021 or null if; file is null, does not exist, can't be read, is not a file or the message cannot be parsed
	 * @since 7.7
	 */
	public static MT021 parse(final File file) throws IOException {
		if (file == null) {
			return null;
		}
		return new MT021(file);
    }
    
	/**
	 * Returns this MT number
	 * @return the message type number of this MT
	 * @since 6.4
	 */
	@Override
	public String getMessageType() {
		return "021";
	}
	
	/**
	 * Add all tags from block to the end of the block4.
	 *
	 * @param block to append
	 * @return this object to allow method chaining
	 * @since 7.6
	 */
	@Override
	public MT021 append(final SwiftTagListBlock block) {
		super.append(block);
		return this;
	}
	
	/**
	 * Add all tags to the end of the block4.
	 *
	 * @param tags to append
	 * @return this object to allow method chaining
	 * @since 7.6
	 */
	@Override
	public MT021 append(final Tag ... tags) {
		super.append(tags);
		return this;
	}
	
	/**
	 * Add all the fields to the end of the block4.
	 *
	 * @param fields to append
	 * @return this object to allow method chaining
	 * @since 7.6
	 */
	@Override
	public MT021 append(final Field ... fields) {
		super.append(fields);
		return this;
	}

    /**
	 * Creates an MT021 messages from its JSON representation.
	 * <p>
	 * For generic conversion of JSON into the corresopnding MT instance
	 * see {@link AbstractMT#fromJson(String)}
	 *
	 * @param json a JSON representation of an MT021 message
	 * @return a new instance of MT021
	 * @since 7.10.2
	 */
	public final static MT021 fromJson(String json) {
		return (MT021) AbstractMT.fromJson(json);
	}

	/**
	 * Iterates through block4 fields and return the first one whose name matches 280, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 280 at MT021 is expected to be the only one.
	 * 
	 * @return a Field280 object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field280 getField280() {
		final Tag t = tag("280");
		if (t != null) {
			return new Field280(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 108, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 108 at MT021 is expected to be the only one.
	 * 
	 * @return a Field108 object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field108 getField108() {
		final Tag t = tag("108");
		if (t != null) {
			return new Field108(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 431, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 431 at MT021 is expected to be the only one.
	 * 
	 * @return a Field431 object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field431 getField431() {
		final Tag t = tag("431");
		if (t != null) {
			return new Field431(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 281, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 281 at MT021 is expected to be the only one.
	 * 
	 * @return a Field281 object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field281 getField281() {
		final Tag t = tag("281");
		if (t != null) {
			return new Field281(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 252, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 252 at MT021 is expected to be the only one.
	 * 
	 * @return a Field252 object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field252 getField252() {
		final Tag t = tag("252");
		if (t != null) {
			return new Field252(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 254, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 254 at MT021 is expected to be the only one.
	 * 
	 * @return a Field254 object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field254 getField254() {
		final Tag t = tag("254");
		if (t != null) {
			return new Field254(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 255, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 255 at MT021 is expected to be the only one.
	 * 
	 * @return a Field255 object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field255 getField255() {
		final Tag t = tag("255");
		if (t != null) {
			return new Field255(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 256, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 256 at MT021 is expected to be the only one.
	 * 
	 * @return a Field256 object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field256 getField256() {
		final Tag t = tag("256");
		if (t != null) {
			return new Field256(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 257, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 257 at MT021 is expected to be the only one.
	 * 
	 * @return a Field257 object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field257 getField257() {
		final Tag t = tag("257");
		if (t != null) {
			return new Field257(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 258, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 258 at MT021 is expected to be the only one.
	 * 
	 * @return a Field258 object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field258 getField258() {
		final Tag t = tag("258");
		if (t != null) {
			return new Field258(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 259, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 259 at MT021 is expected to be the only one.
	 * 
	 * @return a Field259 object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field259 getField259() {
		final Tag t = tag("259");
		if (t != null) {
			return new Field259(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 260, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 260 at MT021 is expected to be the only one.
	 * 
	 * @return a Field260 object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field260 getField260() {
		final Tag t = tag("260");
		if (t != null) {
			return new Field260(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 152, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 152 at MT021 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field152 objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field152> getField152() {
		final List<Field152> result = new ArrayList<Field152>();
		final Tag[] tags = tags("152");
		for (int i=0; i<tags.length; i++) {
			result.add(new Field152(tags[i].getValue()));
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 153, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 153 at MT021 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field153 objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field153> getField153() {
		final List<Field153> result = new ArrayList<Field153>();
		final Tag[] tags = tags("153");
		for (int i=0; i<tags.length; i++) {
			result.add(new Field153(tags[i].getValue()));
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 421, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 421 at MT021 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field421 objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field421> getField421() {
		final List<Field421> result = new ArrayList<Field421>();
		final Tag[] tags = tags("421");
		for (int i=0; i<tags.length; i++) {
			result.add(new Field421(tags[i].getValue()));
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 202, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 202 at MT021 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field202 objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field202> getField202() {
		final List<Field202> result = new ArrayList<Field202>();
		final Tag[] tags = tags("202");
		for (int i=0; i<tags.length; i++) {
			result.add(new Field202(tags[i].getValue()));
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 203, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 203 at MT021 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field203 objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field203> getField203() {
		final List<Field203> result = new ArrayList<Field203>();
		final Tag[] tags = tags("203");
		for (int i=0; i<tags.length; i++) {
			result.add(new Field203(tags[i].getValue()));
		}
		return result;
	}
	



}
