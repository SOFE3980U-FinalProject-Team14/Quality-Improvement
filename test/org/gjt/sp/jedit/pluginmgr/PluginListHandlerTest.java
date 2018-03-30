/*
 * jEdit - Programmer's Text Editor
 * :tabSize=8:indentSize=8:noTabs=false:
 * :folding=explicit:collapseFolds=1:
 *
 * Copyright © 2018 jEdit contributors
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package org.gjt.sp.jedit.pluginmgr;

import org.gjt.sp.util.Task;
import org.junit.Test;

import static org.junit.Assert.*;

public class PluginListHandlerTest {

    private Task task = null;
    private PluginList pluginList;
    PluginListHandler obj = new PluginListHandler(pluginList, "");
    @Test
    public void attribute_name() throws Exception {
        obj.attribute("NAME","Name_value",true);
        assertEquals("Name_value",obj.getName());
    }
    @Test
    public void attribute_jar() throws Exception {
        obj.attribute("JAR","JAR_value",true);
        assertEquals("JAR_value",obj.getJar());
    }
    @Test
    public void attribute_version() throws Exception {
        obj.attribute("VERSION","VERSION_value",true);
        assertEquals("VERSION_value",obj.getVersion());
    }
    @Test
    public void attribute_date() throws Exception {
        obj.attribute("DATE","DATE_value",true);
        assertEquals("DATE_value",obj.getDate());
    }
    @Test
    public void attribute_obsolete_true() throws Exception {
        obj.attribute("OBSOLETE","TRUE",true);
        assertTrue(obj.isObsolete());
    }
    @Test
    public void attribute_obsolete_false() throws Exception {
        obj.attribute("OBSOLETE","false",true);
        assertFalse(obj.isObsolete());
    }
    @Test
    public void attribute_depWhat() throws Exception {
        obj.attribute("WHAT","WHAT_value",true);
        assertEquals("WHAT_value",obj.getDepWhat());
    }
    @Test
    public void attribute_depFrom() throws Exception {
        obj.attribute("FROM","FROM_value",true);
        assertEquals("FROM_value",obj.getDepFrom());
    }
    @Test
    public void attribute_depTo() throws Exception {
        obj.attribute("TO","TO_value",true);
        assertEquals("TO_value",obj.getDepTo());
    }
    @Test
    public void attribute_depPlugin() throws Exception {
        obj.attribute("PLUGIN","PLUGIN_value",true);
        assertEquals("PLUGIN_value",obj.getDepPlugin());
    }
    @Test
    public void attribute_size() throws Exception {
        int size = 10;
        obj.attribute("SIZE", Integer.toString(size),true);
        assertEquals(size,obj.getSize());
    }
}