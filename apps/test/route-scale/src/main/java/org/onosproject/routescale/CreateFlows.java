/*
 * Copyright 2018-present Open Networking Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onosproject.routescale;

import org.apache.karaf.shell.commands.Argument;
import org.apache.karaf.shell.commands.Command;
import org.onosproject.cfg.ComponentConfigService;
import org.onosproject.cli.AbstractShellCommand;

/**
 * Creates the specified number of routes for scale testing.
 */
@Command(scope = "onos", name = "scale-flows",
        description = "Sets the specified number of flows for scale testing")
public class CreateFlows extends AbstractShellCommand {

    @Argument(index = 0, name = "flowCount", description = "Number of flows to maintain",
            required = true)
    int flowCount;

    @Override
    protected void execute() {
        ComponentConfigService service = get(ComponentConfigService.class);
        service.setProperty("org.onosproject.routescale.ScaleTestManager",
                            "flowCount", String.valueOf(flowCount));
    }

}
