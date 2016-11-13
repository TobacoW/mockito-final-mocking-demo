package cz.sveda.mockito_final_mocking_demo;

/**
 * @author Pavel Sveda <xsveda@gmail.com>
 */
public class NonFinalClass {

    public int nonFinalMethod() {
        return 0;
    }

    public final int finalMethod() {
        return 0;
    }
}
