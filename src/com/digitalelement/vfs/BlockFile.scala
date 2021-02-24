package com.digitalelement.vfs

import java.io.RandomAccessFile
import java.io.File
import java.util
import scala.collection.mutable
import scala.collection.mutable.BitSet

class BlockFile (file : File, blockSize : Int = 4 * 1024, headerSize : Int = 4) {

  val randomAccessFile : RandomAccessFile = new RandomAccessFile( file, "rw" )
  //contains a map of the allocation state of the data blocks
  val dataBitmap : BitSet = new mutable.BitSet( blockSize * 8 * headerSize )
  initialize()


  def initialize(): Unit = {
    if( randomAccessFile.length() == 0 ){
    } else {
    }
    //the header is just a bitmap that specifies what blocks are allocated (1) or not (0)
  }

  def getBlock(index: Int ) : Array[ Byte ] = {
    val ret : Array[ Byte ] = new Array[ Byte ]( blockSize );
    randomAccessFile.seek((index + firstDataBlockIndex) * blockSize)
    randomAccessFile.read(ret)
    return ret;
  }

}

object BlockFile {

}