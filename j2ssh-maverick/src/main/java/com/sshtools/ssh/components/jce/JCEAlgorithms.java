package com.sshtools.ssh.components.jce;

/**
 * Interface containing the JCE algorithms required by the API. 
 * @author Lee David Painter
 *
 */
public interface JCEAlgorithms {

	/** Secure random algorithm 'Sha1PRNG' **/
	public static final String JCE_SHA1PRNG = "SHA1PRNG";
	/** RSA public key algorithm 'RSA' **/
	public static final String JCE_RSA = "RSA";
	/** DSA public key algorithm 'DSA' **/
	public static final String JCE_DSA = "DSA";
	/** RSA signature algorithm 'SHA1WithRSA' **/
	public static final String JCE_SHA1WithRSA = "SHA1WithRSA";
	/** RSA signature algorithm 'SHA1WithRSA' **/
	public static final String JCE_MD5WithRSA = "MD5WithRSA";
	/** DSA signature algorithm 'SHA1WithDSA' **/
	public static final String JCE_SHA1WithDSA = "SHA1WithDSA";
	/** MD5 digest algorithm 'MD5' **/
	public static final String JCE_MD5 = "MD5";
	/** SHA1 digest algorithm 'SHA-1' **/
	public static final String JCE_SHA1 = "SHA-1";
	/** SHA256 digest algorithm 'SHA-256' **/
	public static final String JCE_SHA256 = "SHA-256";
	/** AES encryption algorithm 'AES/CBC/NoPadding' **/
	public static final String JCE_AESCBCNOPADDING = "AES/CBC/NoPadding";
	/** Blowfish encryption algorithm 'Blowfish/CBC/NoPadding' **/
	public static final String JCE_BLOWFISHCBCNOPADDING = "Blowfish/CBC/NoPadding";
	/** Diffie Hellman key agreement algorithm 'DH' **/
	public static final String JCE_DH = "DH";
	/** MD5 message authentication code algorithm 'HmacMD5' **/
	public static final String JCE_HMACMD5 = "HmacMD5";
	/** SHA1 message authentication code algorithm 'HmacSha1' **/
	public static final String JCE_HMACSHA1 = "HmacSha1";
	/** SHA 256 bit message authentication code algorithm 'HmacSha256' **/
	public static final String JCE_HMACSHA256 = "HmacSha256";
	/** SHA 512 bit message authentication code algorithm 'HmacSha256' **/
	public static final String JCE_HMACSHA512 = "HmacSha512";
	/** DES encrpytion algorithm 'DES/CBC/NoPadding' **/
	public static final String JCE_DESCBCNOPADDING = "DES/CBC/NoPadding";
	/** RSA encryption algorithm 'RSA/NONE/PKCS1Padding' **/
	public static final String JCE_RSANONEPKCS1PADDING = "RSA";
	/** X509 certificate algorithm 'X.509' **/
	public static final String JCE_X509 = "X.509";
	
	/** AES in counter clock mode 'AES/CTR/NoPadding' **/
	public static final String JCE_AESCTRNOPADDING = "AES/CTR/NoPadding";
	
	/** 3DES in counter clock mode 'DESede/CTR/NoPadding' **/
	public static final String JCE_3DESCTRNOPADDING = "DESede/CTR/NoPadding";

	/** 3DES in CBC mode 'DESede/CTR/NoPadding' **/
	public static final String JCE_3DESCBCNOPADDING = "DESede/CBC/NoPadding";

	/** ARCFOUR cipher **/
	public static final String JCE_ARCFOUR = "ARCFOUR";

	
	
}
