/**
 * (C) Copyright IBM Corporation 2015.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package net.wasdev.wlp.maven.plugins.server;

import net.wasdev.wlp.ant.CleanTask;
import net.wasdev.wlp.maven.plugins.BasicSupport;

/**
 * Clean log directory of liberty server
 * 
 * @goal clean-goal
 */
public class CleanGoalMojo extends BasicSupport {
    
    protected void doExecute() throws Exception {
        CleanTask cleanTask = (CleanTask) ant
                .createTask("antlib:net/wasdev/wlp/ant:clean");
        
        if (cleanTask == null) {
            throw new NullPointerException("Clean task not found.");
        }
        
        cleanTask.setInstallDir(installDirectory);
        cleanTask.setServerName(serverName);
        cleanTask.setUserDir(userDirectory);
        cleanTask.setOutputDir(outputDirectory);
        cleanTask.execute();
    }
    
}
