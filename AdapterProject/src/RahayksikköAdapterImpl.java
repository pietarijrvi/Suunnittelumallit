
public class RahayksikköAdapterImpl implements RahayksikköAdapter{

	private Pankkitili tili;
	
	public RahayksikköAdapterImpl(Pankkitili tili) {
		this.tili = tili;
	}

	@Override
	public double getRahat() {
		return muunnaEurotDollareiksi(tili.getRahat());
	}

	private double muunnaEurotDollareiksi(double e) {
		return e*1.08260;
	}
}
