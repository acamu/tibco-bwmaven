/**
 * (C) Copyright 2011-2015 FastConnect SAS
 * (http://www.fastconnect.fr/) and others.
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
package fr.fastconnect.factory.tibco.bw.maven.deployment.batch;

import java.util.ArrayList;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name="batch-undeploy-bw", defaultPhase=LifecyclePhase.PREPARE_PACKAGE, requiresProject = false)
public class UndeployBatchMojo extends AbstractBWBatchDeployMojo {

	protected final static String UNDEPLOY_BATCH = "Undeploying from domain (batch)...";
	protected final static String UNDEPLOY_FAILED = "The batch undeployment failed.";

	@Override
	public String getInitMessage() {
		super.getInitMessage();
		return UNDEPLOY_BATCH;
	}

	@Override
	public String getFailureMessage() {
		return UNDEPLOY_FAILED;
	}

	@Override
	public void postAction() throws MojoExecutionException {
		//
	}

	@Override
	public ArrayList<String> arguments() {
		ArrayList<String> arguments = super.commonArguments();

		arguments.add("-batchUndeploy");

		return arguments;
	}

}
