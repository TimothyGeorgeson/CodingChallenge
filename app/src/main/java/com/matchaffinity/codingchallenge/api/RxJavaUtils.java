package com.matchaffinity.codingchallenge.api;

import com.matchaffinity.codingchallenge.model.Contributor;

import java.util.List;

import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

public class RxJavaUtils {

    public static Predicate<Contributor> getPredicate() {

        return new Predicate<Contributor>() {
            @Override
            public boolean test(Contributor contributor) throws Exception {
                return contributor.getCommits() > 100;
            }
        };
    }

    public static Function<List<Contributor>, Contributor> getMap(){

        return new Function<List<Contributor>, Contributor>() {
            @Override
            public Contributor apply(List<Contributor> contributors) throws Exception {

                return null;
            }
        };

    }


}
