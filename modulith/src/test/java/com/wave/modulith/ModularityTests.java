package com.wave.modulith;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;

public class ModularityTests {

	ApplicationModules modules = ApplicationModules.of(WaveModulithApplication.class);

	@Test
	void verifyModularity() {
		// --> Module model
		System.out.println(modules.toString());

		// --> Trigger verification
		modules.verify();
	}
}
