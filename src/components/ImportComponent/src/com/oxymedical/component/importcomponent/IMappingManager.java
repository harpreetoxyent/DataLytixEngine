// Decompiled by DJ v3.12.12.98 Copyright 2014 Atanas Neshkov  Date: 8/25/2014 12:06:16 PM
// Home Page: http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   IMappingManager.java

package com.oxymedical.component.importcomponent;

import com.oxymedical.component.importcomponent.exception.ImportComponentException;
import java.util.List;

public interface IMappingManager
{

    public abstract String getClassName();

    public abstract List getSortedSettersList()
        throws ImportComponentException;
}