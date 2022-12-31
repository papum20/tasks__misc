public interface IAnimale {
	public String getVerso();
	public int getZampe();
	public int getEta();

	@Override
	public String toString();

	public int confronta(IAnimale a);

}
