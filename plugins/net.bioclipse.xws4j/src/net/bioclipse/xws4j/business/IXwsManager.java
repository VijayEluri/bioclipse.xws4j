package net.bioclipse.xws4j.business;

import net.bioclipse.core.PublishedMethod;
import net.bioclipse.core.Recorded;
import net.bioclipse.core.business.IBioclipseManager;
import net.bioclipse.xws.client.Client;
import net.bioclipse.xws.client.XmppItem;
import net.bioclipse.xws.client.adhoc.Function;
import net.bioclipse.xws.client.adhoc.Service;
import net.bioclipse.xws.exceptions.XmppException;
import net.bioclipse.xws4j.exceptions.Xws4jException;

/**
 * 
 * This file is part of the Bioclipse xws4j Plug-in.
 * 
 * Copyright (C) 2008 Johannes Wagener
 * 
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 3 of the License, or (at your option) any later
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, see <http://www.gnu.org/licenses>.
 * 
 * @author Johannes Wagener, Ola Spjuth
 */
public interface IXwsManager extends IBioclipseManager {

    /**
     * Get the default XMPP Web Services Client.
     * @throws Xws4jException
     */
    @PublishedMethod( methodSummary = "Returns the default XMPP Web Services Client object" )
    @Recorded
    public Client getDefaultClient() throws Xws4jException;

    /**
     * Returns the status of the default XMPP Web Services Client.
     * @return The status of the default XMPP Web Services Client
     */
    @PublishedMethod( methodSummary = "Returns the status of the default XMPP Web Services Client" )
    @Recorded
    public String getStatus();
    
    /**
     * Connect to XMPP server.
     * @throws Xws4jException, XmppException
     */
    @PublishedMethod( methodSummary = "Connect to XMPP server" )
    @Recorded
    public void connect() throws Xws4jException, XmppException;

    /**
     * Disconnect from XMPP server.
     * @throws Xws4jException, XmppException
     */
    @PublishedMethod( methodSummary = "Disconnect from XMPP server" )
    @Recorded
    public void disconnect() throws Xws4jException, XmppException;
    
    /**
     * Returns true if connected to XMPP server. 
     * @throws XmppException
     * @return true if the default XMPP Web Services Client is connected
     * @throws Xws4jException
     */
    @PublishedMethod( methodSummary = "Returns true if connected to XMPP server" )
    @Recorded
    public boolean isConnected() throws Xws4jException;
    
    /**
     * Creates a XmppItem with the specified JID and node.
     * @param jid The JabberID
     * @param node The node
     * @return The created XmppItem
     * @throws Xws4jException
     */
    @PublishedMethod( methodSummary = "Creates a XmppItem with the specified JID and node" )
    @Recorded
    public XmppItem getXmppItem(String jid, String node) throws Xws4jException;
    
    /**
     * Creates a Service with the specified JID.
     * @param service_jid The JabberID of the Service
     * @return The created Service
     * @throws Xws4jException
     */
    @PublishedMethod( methodSummary = "Creates a Service with the specified JID" )
    @Recorded
    public Service getService(String service_jid) throws Xws4jException;
    
    /**
     * Creates a Function with the specified service JID and function name.
     * @param service_jid The JabberID of the Service that hosts the function
     * @param function_name The name of the function
     * @return The created Function
     * @throws Xws4jException
     */
    @PublishedMethod( methodSummary = "Creates a Function with the specified service JID and function name" )
    @Recorded
    public Function getFunction(String service_jid, String function_name) throws Xws4jException;
    
    /**
     * 
     * @param server The server to list services and functions from
     * @return
     * @throws BioclipseException
     * @throws InvocationTargetException
     * @throws Xws4jException
     * @throws XmppException
     * @throws XwsException
     * @throws InterruptedException
     *
    @PublishedMethod( methodSummary = "List XWS services from a server", 
    		params="server = the XMPP server" )
    @Recorded
	String listServices(String server) throws BioclipseException,
			InvocationTargetException, Xws4jException, XmppException,
			XwsException, InterruptedException;*/
}