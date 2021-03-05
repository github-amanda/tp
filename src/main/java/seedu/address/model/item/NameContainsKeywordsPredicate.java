package seedu.address.model.item;

import java.util.List;
import java.util.function.Predicate;

import seedu.address.commons.util.StringUtil;

/**
<<<<<<< HEAD:src/main/java/seedu/address/model/person/NameContainsKeywordsPredicate.java
 * Tests that a {@code Person}'s {@code Item Name} matches any of the keywords given.
=======
 * Tests that a {@code Item}'s {@code Name} matches any of the keywords given.
>>>>>>> upstream/mid-1.2-base-refactor:src/main/java/seedu/address/model/item/NameContainsKeywordsPredicate.java
 */
public class NameContainsKeywordsPredicate implements Predicate<Item> {
    private final List<String> keywords;

    public NameContainsKeywordsPredicate(List<String> keywords) {
        this.keywords = keywords;
    }

    @Override
    public boolean test(Item item) {
        return keywords.stream()
            .anyMatch(keyword -> StringUtil.containsWordIgnoreCase(item.getItemName().fullName, keyword));
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
            || (other instanceof NameContainsKeywordsPredicate // instanceof handles nulls
            && keywords.equals(((NameContainsKeywordsPredicate) other).keywords)); // state check
    }

}
