package com.bluedesk.builder.example;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

/**
 * @author eliran
 *
 */
public final class ExampleEntityVO implements ExampleEntity {

    private Long id;

    private final Collection<String> strings = new HashSet<String>();
    private Integer field;

    ExampleEntityVO() {
    }

    @Override
    public Long getId() {
	return id;
    }

    void setId(final Long id) {
	this.id = id;
    }

    @Override
    public Collection<String> getStrings() {
	return Collections.unmodifiableCollection(strings);
    }

    void setStrings(final Collection<String> strings) {
	this.strings.clear();
	this.strings.addAll(strings);
    }

    @Override
    public Integer getField() {
	return field;
    }

    void setField(final Integer field) {
	this.field = field;
    }

    public static final Builder newBuilder() {
	return new Builder();
    }

    public static final Builder newBuilder(final ExampleEntity entity) {
	return new Builder(entity, true);
    }

    public static final Builder updateBuilder(final ExampleEntity entity) {
	return new Builder(entity, false);
    }

    public static final class Builder implements
	    com.bluedesk.builder.Builder<ExampleEntity> {

	private final ExampleEntityVO vo;

	private Builder() {
	    vo = new ExampleEntityVO();
	}

	private Builder(final ExampleEntity entity, final boolean newInstance) {
	    this();
	    vo.setId(newInstance ? null : entity.getId());
	    vo.setField(entity.getField());
	    vo.setStrings(entity.getStrings());
	}

	@Override
	public ExampleEntity build() {
	    // here we can validate the complete object and throw exception if needed
	    return vo;
	}

	public Builder setField(final Integer field) {
	    // validate value
	    vo.setField(field);
	    return this;
	}

	public Builder addString(final String string) {
	    vo.strings.add(string);
	    return this;
	}

	public Builder addAllStrings(final Collection<String> strings) {
	    vo.strings.addAll(strings);
	    return this;
	}

	public Builder removeString(final String string) {
	    vo.strings.remove(string);
	    return this;
	}

	public Builder removeAllStrings(final Collection<String> strings) {
	    vo.strings.removeAll(strings);
	    return this;
	}

	public Builder clearStrings() {
	    vo.strings.clear();
	    return this;
	}
    }

}
