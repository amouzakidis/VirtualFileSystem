package com.digitalelement.vfs.utils

import scala.collection.BitSet
import scala.collection.mutable.BitSet

object BitsetUtils {

  def fromByteArray(bytes: Array[Byte]): BitSet = {
    val bits = new scala.collection.mutable.BitSet( bytes.length * 8 )
    for (i <- 0 until bytes.length * 8) {
      if ((bytes(bytes.length - i / 8 - 1) & (1 << (i % 8))) > 0) bits.set(i)
    }
    bits
  }

  def toByteArray(bitSet : Bitset , bytes: Array[Byte]): Nothing = {
    val bits = new Nothing
    for (i <- 0 until bytes.length * 8) {
      if ((bytes(bytes.length - i / 8 - 1) & (1 << (i % 8))) > 0) bits.set(i)
    }
    bits
  }

}
