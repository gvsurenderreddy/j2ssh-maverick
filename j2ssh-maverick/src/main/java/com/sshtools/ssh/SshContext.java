
package com.sshtools.ssh;

/**
 * <p>This interface defines the general configuration items available to both SSH1 and SSH2.
 * Each new instance of <a href="SshConnector.html">SshConnector</a> is initialized with
 * a configuration context for each protocol version. When the user connects to a remote
 * SSH server using the <a href="SshConnector.html">SshConnector</a> the returned
 * <a href="SshClient.html">SshClient<a> is configured with the context according to the
 * protocol version. Multiple connections can be made from the <a href="SshConnector.html">SshConnector</a>
 * with the same context, and with different instances of <a href="SshConnector.html">SshConnector</a>
 * having different contexts.
 * </p>
 *
 * @author Lee David Painter
 * @see SshConnector
 * @see com.maverick.ssh1.Ssh1Context
 * @see com.sshtools.ssh2.Ssh2Context
 */
public interface SshContext {


  /**
   * Set the maximum number of channels that are allowed open at any one time.
   * @param max
   */
  public void setChannelLimit(int max);

  /**
   * Get the maximum number of channels that are allowed open at any one time.
   * @return the maximum number of channels
   */
  public int getChannelLimit();

  /**
   * Set the host key verification implementation.
   * @param verify
   */
  public void setHostKeyVerification(HostKeyVerification verify);

  /**
   * Get the host key verification implementation.
   * @return the current host key verification implementation
   */
  public HostKeyVerification getHostKeyVerification();

  /**
   * Set the path to the SFTP provider. For SSH1 connections an attempt to
   * execute this provider will be made as SSH1 does not support subsystems. For
   * SSH2 connections an attempt will be made to execute this provider if the
   * subsystem cannot be started.
   *
   * @param sftpProvider
   */
  public void setSFTPProvider(String sftpProvider);

  /**
   * Get the path to the SFTP provider. For SSH1 connections an attempt to
   * execute this provider will be made as SSH1 does not support subsystems. For
   * SSH2 connections an attempt will be made to execute this provider if the
   * subsystem cannot be started. The default is '/usr/libexec/sftp-server'
   *
   * @return String
   */
  public String getSFTPProvider();

  /**
   * Set the DISPLAY variable for the SSH connection. If this is set the
   * SSH sessions will have their DISPLAY variable set and X sessions will
   * be forwarded over the SSH connection to the display specified.
   *
   * @param xDisplay the display in the form localhost:1
   */
   public void setX11Display(String xDisplay);


   /**
    * Get the currently configured XDisplay setting which will be null if no
    * display is currently set.
    *
    * @return String
    */
   public String getX11Display();

   /**
    * Get a fake random cookie for X11 authentication
    * @return byte[]
 * @throws SshException 
    */
   public byte[] getX11AuthenticationCookie() throws SshException;

   /**
    * Set the fake cookie used for X11 authentication
    * 
    * @param x11FakeCookie
    */
   public void setX11AuthenticationCookie(byte[] x11FakeCookie);
   
   /**
    * Sets the real X11 authentication cookie which can be obtained from the
    * users $HOME/.Xauthority file.
    *
    *
    * @param x11RealCookie
    */
   public void setX11RealCookie(byte[] x11RealCookie);

   /**
    * Get the real X11 authentication cookie, if not cookie has been set the
    * fake cookie will be returned.
    *
    * @return byte[]
 * @throws SshException 
    */
   public byte[] getX11RealCookie() throws SshException;

   /**
    * Set the listener to which X11 forwarding requests will be processed.
    * @param listener
    */
   public void setX11RequestListener(ForwardingRequestListener listener);

   /**
    * Get the X11 forwarding request listener.
    * @return ForwardingRequestListener
    */
   public ForwardingRequestListener getX11RequestListener();
   
   /**
    * Enables FIPS compatible algorithms and disables any other non-compatible algorithms.
 * @throws SshException 
    */
   public void enableFIPSMode() throws SshException;

}
