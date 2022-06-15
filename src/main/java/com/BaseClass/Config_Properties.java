package com.BaseClass;

public class Config_Properties implements IAutoConsts{

	protected static String US_URL;
	protected static String UK_URL;
	protected static String AU_URL;
	protected static String REG_US_URL;
	protected static String REG_UK_URL;
	protected static String REG_AU_URL;
	
	
	public static void loadConfigValues() throws Throwable {
		
		 UK_URL = new FileLib().readProprertyData(Prop_Path, "uk_url");
		 AU_URL = new FileLib().readProprertyData(Prop_Path, "au_url");
		 REG_US_URL = new FileLib().readProprertyData(Prop_Path, "reg_us_url");
		 REG_UK_URL = new FileLib().readProprertyData(Prop_Path, "reg_uk_url");
		 REG_AU_URL = new FileLib().readProprertyData(Prop_Path, "reg_au_url");
	}
}
