package xyz.theprogramsrc.supercoreapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.lang.Math;

/**
 * Representation of a set of mathematical utils for
 * a plugin
 */
public interface SuperMathUtils {

    /**
     * Get the hypothenuse of mutliple values.
     * @param List of Doubles
     * @return The hypothenuse lenght.
     */
    Double parseHypothenuse(List<Double, Boolean root> values) {
      Double result = 0;
            for (Double d : values) {
                result = result + d * d;
            }
            if (root) {
            return Math.sqrt(result);
            } else {
            return result;
            }
    }
 }