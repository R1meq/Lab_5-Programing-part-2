package ua.lviv.iot.algo.part1.lab_5;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UnderlineFilter {
    public  final Pattern UNDERLINE_PATTERN
            = Pattern.compile("([a-zA-Z]*_+[a-zA-Z]*)+");

    public  List<String> sortedListWithUnderlineWords(
            final String input, final int maxLength) {
        List<String> strings = new ArrayList<>();
        Matcher matcher = UNDERLINE_PATTERN.matcher(input);

        while (matcher.find()) {
            strings.add(matcher.group().replaceAll("_", ""));
        }

        return strings.stream()
                .filter((string) -> string.length() < maxLength).toList()
                .stream().sorted(String.CASE_INSENSITIVE_ORDER).toList();
    }
}
