package org.ef.behavioral.iterator;

public class BlocksNFTCollection implements Collection {

    private String author;
    private String[] nftList;

    public BlocksNFTCollection(String author, String[] nftList) {
        this.author = author;
        this.nftList = nftList;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String[] getNftList() {
        return nftList;
    }

    public void setNftList(String[] nftList) {
        this.nftList = nftList;
    }

    @Override
    public Iterator getIterator() {
        return new NFTIterator();
    }

    private class NFTIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < nftList.length) {
                return true;
            }
            return false;
        }


        @Override
        public Object next() {
            return nftList[index++];
        }
    }
}
