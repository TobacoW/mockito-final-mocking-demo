package cz.sveda.mockito_final_mocking_demo;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * @author Pavel Sveda <xsveda@gmail.com>
 */
@RunWith(JUnitParamsRunner.class)
public final class Tests {

    @Test
    @Parameters(method = "integers")
    public void nonFinalClass_nonFinalMethod(int value) {
        NonFinalClass instance = mock(NonFinalClass.class);
        when(instance.nonFinalMethod()).thenReturn(value);

        int result = instance.nonFinalMethod();

        assertThat(result, is(value));
    }

    @Test
    @Parameters(method = "integers")
    public void nonFinalClass_finalMethod(int value) {
        NonFinalClass instance = mock(NonFinalClass.class);
        when(instance.finalMethod()).thenReturn(value);

        int result = instance.finalMethod();

        assertThat(result, is(value));
    }

    @Test
    @Parameters(method = "integers")
    public void finalClass_nonFinalMethod(int value) {
        FinalClass instance = mock(FinalClass.class);
        when(instance.nonFinalMethod()).thenReturn(value);

        int result = instance.nonFinalMethod();

        assertThat(result, is(value));
    }

    @Test
    @Parameters(method = "integers")
    public void finalClass_finalMethod(int value) {
        FinalClass instance = mock(FinalClass.class);
        when(instance.finalMethod()).thenReturn(value);

        int result = instance.finalMethod();

        assertThat(result, is(value));
    }

    @SuppressWarnings("unused")
    private Object[] integers() {
        List<Integer> ints = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            ints.add(i);
        }
        return ints.toArray();
    }
}
