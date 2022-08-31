package com.example.plugin.hailungathererplugin;

import com.funnelback.plugin.test.AbstractPluginPropertiesFileTest;

/**
 *  Tests to check that the plugin properties file is valid.
 */
public class PluginPropsFileTest extends AbstractPluginPropertiesFileTest {

    /**
     * Originally set to the maven artifact id, if the name of the plugin changes
     * it will need to be updated here for the test to pass.
     */
    @Override
    public String getPluginName() {
        return PluginUtils.PLUGIN_NAME;
    }

    
}
