package com.example.plugin.hailungathererplugin;

import org.junit.Assert;
import org.junit.Test;

import com.funnelback.plugin.gatherer.mock.MockPluginGatherContext;
import com.funnelback.plugin.gatherer.mock.MockPluginStore;

public class HailunGathererPluginPluginGathererTest {

    @Test 
    public void testCustomGatherPlugin() throws Exception {
        MockPluginGatherContext mockContext = new MockPluginGatherContext();
        MockPluginStore mockStore = new MockPluginStore();
        
        
        HailunGathererPluginPluginGatherer underTest = new HailunGathererPluginPluginGatherer();
        // As the plugin gatherer is likely to interact with an external system you may need
        // to mock those interactions out. Until that is done you can still use this test to
        // try out your gatherer locally.
        underTest.gather(mockContext, mockStore);
        
        Assert.assertTrue("Check how many documents were stored.", mockStore.getStored().size() >= 0);
    }
    
}
