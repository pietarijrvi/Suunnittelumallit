
public interface Tila {
	
	public void getNimi();
	public void hyökkää(Pokemon p);
	public void kehity(Pokemon p);
	public void otaDamagea(Pokemon p);
	public void pyörry(Pokemon p);
	public void accept(PokemonStateVisitor visitor);
}
