package org.ef.behavioral.observer;

import java.util.List;

public interface Observer {
    public void HandleEvent(List<String> tokens);
}
