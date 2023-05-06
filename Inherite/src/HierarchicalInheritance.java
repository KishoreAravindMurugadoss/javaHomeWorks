class appa {
	void possesion() {
		System.out.println("appa has a nokia phone");
	}
}
class brother extends appa{
	void possesion1() {
		System.out.println("brother has 1+ phone");
		System.out.println("brother can use his 1+ phone as well as appa's Nokia phone");
	}
}
class sister extends appa{
	void possesion2() {
		System.out.println("sister has iPhone");
		System.out.println("sister can use hes iPhone as well as appa's Nokia phone");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		brother b = new brother();
		sister s = new sister();
		b.possesion1();
		s.possesion2();
	}

}
