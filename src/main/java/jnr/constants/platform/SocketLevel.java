// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2018-09-20 16:28:41 +0000
package jnr.constants.platform;
public enum SocketLevel implements jnr.constants.Constant {
SOL_SOCKET,
SOL_IP,
SOL_TCP,
SOL_UDP,
__UNKNOWN_CONSTANT__;
private static final ConstantResolver<SocketLevel> resolver = 
ConstantResolver.getResolver(SocketLevel.class, 20000, 29999);
public final int value() { return (int) resolver.longValue(this); }
public final int intValue() { return (int) resolver.longValue(this); }
public final long longValue() { return resolver.longValue(this); }
public final String description() { return resolver.description(this); }
public final boolean defined() { return resolver.defined(this); }
public final String toString() { return description(); }
public static SocketLevel valueOf(long value) { 
    return resolver.valueOf(value);
}
}
