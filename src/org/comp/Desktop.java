package org.comp;

public class Desktop implements Hardware,Software {
	public void desktopModel() {
		System.out.println("DELL");
	}

	@Override
	public void softwareresources() {
		System.out.println("Windows 10");
		
	}

	@Override
	public void hardwareResource() {
		System.out.println("intel i7");
		
	}
	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.desktopModel();
		d.softwareresources();
		d.hardwareResource();
	}

}
