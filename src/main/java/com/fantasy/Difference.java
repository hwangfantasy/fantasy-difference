package com.fantasy;

/**
 * Class representing one diff operation.
 */
public class Difference {
    /**
     * One of: INSERT, DELETE or EQUAL.
     * {@link Operation}
     */
    public Operation operation;
    /**
     * The text associated with this diff operation.
     */
    public String text;

    /**
     * Constructor.  Initializes the diff with the provided values.
     * @param operation One of INSERT, DELETE or EQUAL.
     * @param text The text being applied.
     */
    public Difference(Operation operation, String text) {
        // Construct a diff with the specified operation and text.
        this.operation = operation;
        this.text = text;
    }


    /**
     * Display a human-readable version of this Diff.
     * @return text version.
     */
    public String toString() {
        String prettyText = this.text.replace('\n', '\u00b6');
        return "Diff(" + this.operation + ",\"" + prettyText + "\")";
    }


    /**
     * Is this Diff equivalent to another Diff?
     * @param d Another Diff to compare against.
     * @return true or false.
     */
    public boolean equals(Object d) {
        try {
            return (((Difference) d).operation == this.operation)
                    && (((Difference) d).text.equals(this.text));
        } catch (ClassCastException e) {
            return false;
        }
    }
}