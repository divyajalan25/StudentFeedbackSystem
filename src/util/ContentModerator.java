package util;

public class ContentModerator {

    private static final String[] BAD_WORDS = {
        "stupid",
        "idiot",
        "hate"
    };

    public static String moderate(String comment) {

        String moderatedComment = comment;

        for (String word : BAD_WORDS) {

            String replacement = "*".repeat(word.length());

            moderatedComment = moderatedComment.replaceAll(
                    "(?i)\\b" + word + "\\b",
                    replacement
            );
        }

        return moderatedComment;
    }
}