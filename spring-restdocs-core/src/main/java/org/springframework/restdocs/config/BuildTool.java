package org.springframework.restdocs.config;

import org.springframework.restdocs.RestDocumentationContext;

/**
 * Defines the build tools, Gradle or Maven, and their default build output
 * directories for configuring a {@link RestDocumentationContext}.
 *
 * @author Drummond Dawson
 * @since 1.2.0
 */
public enum BuildTool {

	GRADLE("build/generated-snippets"), MAVEN("target/generated-snippets");

	private String outputDirectory;

	BuildTool(String outputDirectory) {
		this.outputDirectory = outputDirectory;
	}

	public String getOutputDirectory() {
		return this.outputDirectory;
	}

}
