package com.st.novatech.orchestratorapp.entity;

import java.io.Serializable;
import java.util.Objects;



/**
 * A class to be the primary key of a {@link BranchCopies} for JPA, which
 * requires every entity to have a single primary key.
 *
 * <p>Declared to implement Serializable because "Composite-id class must implement
 * Serializable."
 *
 * @author Jonathan Lovelace
 */

public class CopiesIdentity implements Serializable {
	/**
	 * Serialization version. Increment on any change to class structure that is
	 * pushed to production.
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The branch that owns the copies.
	 */

	private final Branch branch;
	/**
	 * The book that this represents copies of.
	 */

	private final Book book;

	/**
	 * No-arg constructor required for JPA.
	 */
	protected CopiesIdentity() {
		this(null, null);
	}
	/**
	 * To construct an instance of this class reliably, the caller must supply the
	 * book and branch in question.
	 *
	 * @param book the book in question
	 * @branch branch the branch in question
	 */
	public CopiesIdentity(final Book book, final Branch branch) {
		this.branch = branch;
		this.book = book;
	}
	/**
	 * Get the book the containing object represents the number of copies of.
	 */
	public Book getBook() {
		return book;
	}
	/**
	 * Get the branch the containing object represents copies in.
	 */
	public Branch getBranch() {
		return branch;
	}
	/**
	 * Test whether an object is equal to this one.
	 * @param obj an object
	 * @return true iff it is a CopiesIdentity with equal book and branch
	 */
	@Override
	public boolean equals(final Object obj) {
		if (obj instanceof CopiesIdentity) {
			return Objects.equals(book, ((CopiesIdentity) obj).getBook())
					&& Objects.equals(branch, ((CopiesIdentity) obj).getBranch());
		} else {
			return false;
		}
	}
	/**
	 * Calculate a hash value for this object.
	 * @return a hash value based on the book and branch.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(book, branch);
	}
}
