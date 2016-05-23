package com.shagaba.magazine.web.rest.dto.errors;

public class FieldErrorDetail extends ObjectErrorDetail {

	protected String field;

	/**
	*
	*/
	public FieldErrorDetail() {
	}

	/**
	 * @param field
	 * @param message
	 */
	public FieldErrorDetail(String field, String message) {
		super(null, message);
		this.field = field;
	}

	/**
	 * @param object
	 * @param field
	 * @param message
	 */
	public FieldErrorDetail(String object, String field, String message) {
		super(object, message);
		this.field = field;
	}

	/**
	 * @return the field
	 */
	public String getField() {
		return field;
	}

	/**
	 * @param field
	 *            the field to set
	 */
	public void setField(String field) {
		this.field = field;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("FieldErrorDetail {object=%s, message=%s, field=%s}", object, message, field);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((field == null) ? 0 : field.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		FieldErrorDetail other = (FieldErrorDetail) obj;
		if (field == null) {
			if (other.field != null)
				return false;
		} else if (!field.equals(other.field))
			return false;
		return true;
	}

	
}
