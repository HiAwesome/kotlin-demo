package com.moqi.java.ch04;

import com.moqi.kotlin.ch04.State;
import com.moqi.kotlin.ch04.View;
import org.jetbrains.annotations.NotNull;

/**
 * 用带内部类的 Java 代码来实现 View
 *
 * @author moqi On 12/3/20 16:36
 */

public class Button implements View {

    @NotNull
    @Override
    public State getCurrentState() {
        return new ButtonState();
    }

    @Override
    public void restoreState(@NotNull State state) {

    }

    public static class ButtonState implements State {
    }
}
