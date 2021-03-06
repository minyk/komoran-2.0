/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package kr.co.shineware.nlp.komoran.analysis.support;

public class Lattice {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected Lattice(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(Lattice obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				MeCabJNI.delete_Lattice(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void clear() {
		MeCabJNI.Lattice_clear(swigCPtr, this);
	}

	public boolean is_available() {
		return MeCabJNI.Lattice_is_available(swigCPtr, this);
	}

	public Node bos_node() {
		long cPtr = MeCabJNI.Lattice_bos_node(swigCPtr, this);
		return (cPtr == 0) ? null : new Node(cPtr, false);
	}

	public Node eos_node() {
		long cPtr = MeCabJNI.Lattice_eos_node(swigCPtr, this);
		return (cPtr == 0) ? null : new Node(cPtr, false);
	}

	public Node end_nodes(long pos) {
		long cPtr = MeCabJNI.Lattice_end_nodes(swigCPtr, this, pos);
		return (cPtr == 0) ? null : new Node(cPtr, false);
	}

	public Node begin_nodes(long pos) {
		long cPtr = MeCabJNI.Lattice_begin_nodes(swigCPtr, this, pos);
		return (cPtr == 0) ? null : new Node(cPtr, false);
	}

	public String sentence() {
		return MeCabJNI.Lattice_sentence(swigCPtr, this);
	}

	public long size() {
		return MeCabJNI.Lattice_size(swigCPtr, this);
	}

	public void set_Z(double Z) {
		MeCabJNI.Lattice_set_Z(swigCPtr, this, Z);
	}

	public double Z() {
		return MeCabJNI.Lattice_Z(swigCPtr, this);
	}

	public void set_theta(float theta) {
		MeCabJNI.Lattice_set_theta(swigCPtr, this, theta);
	}

	public float theta() {
		return MeCabJNI.Lattice_theta(swigCPtr, this);
	}

	public boolean next() {
		return MeCabJNI.Lattice_next(swigCPtr, this);
	}

	public int request_type() {
		return MeCabJNI.Lattice_request_type(swigCPtr, this);
	}

	public boolean has_request_type(int request_type) {
		return MeCabJNI.Lattice_has_request_type(swigCPtr, this, request_type);
	}

	public void set_request_type(int request_type) {
		MeCabJNI.Lattice_set_request_type(swigCPtr, this, request_type);
	}

	public void add_request_type(int request_type) {
		MeCabJNI.Lattice_add_request_type(swigCPtr, this, request_type);
	}

	public void remove_request_type(int request_type) {
		MeCabJNI.Lattice_remove_request_type(swigCPtr, this, request_type);
	}

	public String toString() {
		return MeCabJNI.Lattice_toString__SWIG_0(swigCPtr, this);
	}

	public String toString(Node node) {
		return MeCabJNI.Lattice_toString__SWIG_1(swigCPtr, this,
				Node.getCPtr(node), node);
	}

	public String enumNBestAsString(long N) {
		return MeCabJNI.Lattice_enumNBestAsString(swigCPtr, this, N);
	}

	public String what() {
		return MeCabJNI.Lattice_what(swigCPtr, this);
	}

	public void set_what(String str) {
		MeCabJNI.Lattice_set_what(swigCPtr, this, str);
	}

	public Lattice() {
		this(MeCabJNI.new_Lattice(), true);
	}

	public void set_sentence(String sentence) {
		MeCabJNI.Lattice_set_sentence(swigCPtr, this, sentence);
	}

}
