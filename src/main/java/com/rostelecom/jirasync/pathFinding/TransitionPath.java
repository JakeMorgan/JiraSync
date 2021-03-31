package com.rostelecom.jirasync.pathFinding;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Jake Morgan {@literal <aleksey.tarasenkov@rt.ru>}
 */
@AllArgsConstructor
@Getter
@Setter
public class TransitionPath {
    private int id;
    private String nameTo;
    List<Integer> path;
}
