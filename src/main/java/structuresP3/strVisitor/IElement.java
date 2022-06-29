package structuresP3.strVisitor;

public interface IElement {
    void accept(IVisitor visitor);
    String method1();
    String method2();
}
