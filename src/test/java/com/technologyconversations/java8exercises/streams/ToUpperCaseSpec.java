package com.technologyconversations.java8exercises.streams;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

import static com.technologyconversations.java8exercises.streams.ToUpperCase.*;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

/*
Convert elements of a collection to upper case.
 */
public class ToUpperCaseSpec {

    @Test
    public void transformShouldConvertCollectionElementsToUpperCase() {
        List<String> collection = asList("My", "name", "is", "John", "Doe");
        List<String> expected = asList("MY", "NAME", "IS", "JOHN", "DOE");
        assertThat(transform2(collection)).hasSameElementsAs(expected);
    }
    
    public static List<String> transform2(List<String> collection) {
		return collection.stream().map(String::toUpperCase).collect(Collectors.toList());
    	
    }

}
