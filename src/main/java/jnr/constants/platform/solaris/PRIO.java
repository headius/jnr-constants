// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2018-09-12 11:32:02 +0200
package jnr.constants.platform.solaris;
public enum PRIO implements jnr.constants.Constant {
PRIO_PROCESS(0L),
// PRIO_MIN not defined
PRIO_PGRP(1L),
PRIO_USER(2L);
// PRIO_MAX not defined
private final long value;
private PRIO(long value) { this.value = value; }
public static final long MIN_VALUE = 0L;
public static final long MAX_VALUE = 2L;

static final class StringTable {
  public static final java.util.Map<PRIO, String> descriptions = generateTable();
  public static final java.util.Map<PRIO, String> generateTable() {
    java.util.Map<PRIO, String> map = new java.util.EnumMap<PRIO, String>(PRIO.class);
  map.put(PRIO_PROCESS, "PRIO_PROCESS");
  map.put(PRIO_PGRP, "PRIO_PGRP");
  map.put(PRIO_USER, "PRIO_USER");
    return map;
  }
}
public final String toString() { return StringTable.descriptions.get(this); }
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
