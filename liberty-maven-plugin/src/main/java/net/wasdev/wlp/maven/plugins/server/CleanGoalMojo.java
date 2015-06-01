package net.wasdev.wlp.maven.plugins.server;

import net.wasdev.wlp.maven.plugins.BasicSupport;
/**
 * Clean log directory of liberty server
 * 
 * @goal clean-goal
 */
public class CleanGoalMojo extends BasicSupport{
    
    public void doExecute() throws Exception{
        
        getLog().info( "Hello, world." );
        
    }
    
}
