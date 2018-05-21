/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.lambdapredicate;

/**
 *
 * @author wsen
 * @param <T>
 */

public interface Predicate<T> {

    boolean test(T t);
}
