package com.example.kanzeparovrr.postterminalcardapplicationmir.exception;

import java.io.IOException;

/**
 * Exception during communication with EMV card
 * 
 */
public class CommunicationException extends IOException {

	/**
	 * Default constructor
	 * 
	 * @param pMessage
	 *            Exception message
	 */
	public CommunicationException(final String pMessage) {
		super(pMessage);
	}

}
