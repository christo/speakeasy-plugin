package com.atlassian.labs.speakeasy;

import com.atlassian.plugin.ModuleDescriptor;
import com.atlassian.plugin.webresource.WebResourceModuleDescriptor;

import java.util.List;

/**
 *
 */
public interface DescriptorGenerator<D extends ModuleDescriptor>
{
    Iterable<D> getDescriptorsToExposeForUsers(List<String> users, int state);
}
