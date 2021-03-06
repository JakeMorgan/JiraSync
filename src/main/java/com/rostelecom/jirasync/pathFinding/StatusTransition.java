package com.rostelecom.jirasync.pathFinding;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author Jake Morgan {@literal <aleksey.tarasenkov@rt.ru>}
 */
@AllArgsConstructor
@Getter
@Setter
public class StatusTransition {
    private int id;
    private String name;
    private List<TransitionPath> transitionPaths;
}
