package day26;

public class AbstractClass1 {

	public static void main(String[] args) {
		Pokemon pokemon=new Pikachu();
		System.out.println("이 포켓몬은:"+pokemon.getName());
		pokemon.attck();
		pokemon.sound();
		
		pokemon=new Squirtle();
		System.out.println("이 포켓몬은:"+pokemon.getName());
		pokemon.attck();
		pokemon.sound();
	}

}
abstract class Pokemon{
	String name;
	abstract void attck();
	abstract void sound();
	public String getName() {
		return this.name;
	}
}
class Pikachu extends Pokemon {
	Pikachu(){
		this.name="피카츄";
	}

	@Override
	void attck() {
		System.out.println("전기공격");
	}

	@Override
	void sound() {
		System.out.println("피카 피카!");
	}
	
}
class Squirtle extends Pokemon{
	Squirtle(){
		this.name="꼬부기";
	}
	@Override
	void attck() {
		System.out.println("물 공격");
	}

	@Override
	void sound() {
		System.out.println("꼬북 꼬북!");
	}
	
}
