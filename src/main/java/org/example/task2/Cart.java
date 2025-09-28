package org.example.task2;

import java.util.Arrays;

public class Cart {
    private Item[] contents;
    private int index;

    public Cart(int capacity)
    {
        this.contents = new Item[capacity];
        this.index = 0;
    }

    public void add(Item item)
    {
        if (this.isCartFull())
        {
            return;
        }
        this.contents[this.index] = item;
        this.index++;
    }

    public void removeById(long itemId)
    {
        if (this.index == 0) return;

        int foundIndex = this.findItemIndex(itemId);
        if (foundIndex == -1) return;

        this.shiftArray(foundIndex);
    }

    private void shiftArray(int itemIndex)
    {
        for (int i = itemIndex; i < this.index - 1; i++)
        {
            this.contents[i] = this.contents[i + 1];
        }
        this.contents[this.index - 1] = null;
        this.index--;
    }

    private int findItemIndex(long itemId)
    {
        for (int i = 0; i < this.index; i++)
        {
            if (this.contents[i].getId() == itemId)
            {
                return i;
            }
        }
        return -1;
    }

    public boolean isCartFull()
    {
        return this.index == this.contents.length;
    }

    public int getItemCount()
    {
        return this.index;
    }

    public Item getItem(int i)
    {
        if (i < 0 || i >= this.index)
        {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return this.contents[i];
    }

    @Override
    public String toString()
    {
        return "Cart{" +
                "contents=" + Arrays.toString(this.contents) +
                "}\n";
    }
}