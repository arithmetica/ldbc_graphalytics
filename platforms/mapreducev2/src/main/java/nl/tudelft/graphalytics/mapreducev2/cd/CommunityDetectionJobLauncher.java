/**
 * Copyright 2015 Delft University of Technology
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package nl.tudelft.graphalytics.mapreducev2.cd;

import nl.tudelft.graphalytics.domain.algorithms.CommunityDetectionParameters;
import nl.tudelft.graphalytics.mapreducev2.MapReduceJobLauncher;
import nl.tudelft.graphalytics.mapreducev2.MapReduceJob;

/**
 * Job launcher for the community detection algorithm on MapReduce version 2.
 *
 * @author Tim Hegeman
 */
public class CommunityDetectionJobLauncher extends MapReduceJobLauncher {
	private CommunityDetectionParameters getParameters() {
    	assert (parameters instanceof CommunityDetectionParameters);
    	return (CommunityDetectionParameters)parameters;
    }

	@Override
	protected MapReduceJob<?> createDirectedJob(String input, String intermediate, String output) {
		return new CommunityDetectionJob(input, intermediate, output, getParameters(), true);
	}

	@Override
	protected MapReduceJob<?> createUndirectedJob(String input, String intermediate, String output) {
		return new CommunityDetectionJob(input, intermediate, output, getParameters(), false);
	}
    
}
