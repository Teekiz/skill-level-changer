package com.skilllevelchanger;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class SkillLevelChangerPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(SkillLevelChangerPlugin.class);
		RuneLite.main(args);
	}
}