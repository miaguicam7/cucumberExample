package example.cucumber.river;

public class RiverService {
	/**
	 * This function it's used to obtain the river from a determinated province.
	 * 
	 * @param province
	 * @return
	 */
	public String getProvinceRiver(String province) {
		switch (province) {
		case "Malaga":
			return "Gualdalhorce";
		case "Madrid":
			return "Manzanares";
		case "Sevilla":
			return "Guadalquivir";
		default:
			return null;
		}
	}
}
