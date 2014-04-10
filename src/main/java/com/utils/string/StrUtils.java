package com.utils.string;

/**
 * User: ruslanpa
 * Date: 4/10/2014 2:07 PM
 * <p/>
 * This simple utility class that provides common operations under text.
 */
public final class StrUtils {

    private StrUtils() {
        // Hidden constructor
    }

    /**
     * Transform text by specified {@link StrUtils.TextTransform} value.
     *
     * @param text          this is original string
     * @param textTransform enum that defines future transformation
     * @return transformed string value
     */
    public static String transform(String text, TextTransform textTransform) {
        return textTransform == null ? text : textTransform.transform(text);
    }

    /**
     * This method returns count of specified incoming char.
     *
     * @param text original string
     * @param ch   incoming char
     * @return count of incoming <code>char<code/>
     */
    public static int count(String text, char ch) {
        int target = 0;
        if (text == null || text.isEmpty()) return target;
        for (char currentChar : text.toCharArray()) {
            if (currentChar == ch) {
                target++;
            }
        }
        return target;
    }

    public static enum TextTransform {
        /**
         * Transform text to upper case.
         */
        UPPERCASE("UpperCase") {
            @Override
            String transform(String text) {
                return text.toUpperCase();
            }
        },

        /**
         * Transform text to lower case.
         */
        LOWERCASE("LowerCase") {
            @Override
            String transform(String text) {
                return text.toLowerCase();
            }
        },

        /**
         * Nothing happens.
         */
        NONE("None") {
            @Override
            String transform(String text) {
                return text;
            }
        };

        private final String originalName;

        TextTransform(String originalName) {
            this.originalName = originalName;
        }

        public String getOriginalName() {
            return originalName;
        }

        abstract String transform(String text);
    }
}
