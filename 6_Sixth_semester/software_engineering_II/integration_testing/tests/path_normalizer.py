from os import path
import sys


def normalize_path() -> None:
    """ Enables importing from parent packages.
        Use this before other imports """
    BASEPATH = path.dirname(__file__)
    BASEPATH = '\\\\'.join((BASEPATH.split("\\"))[:-1])
    sys.path.append(BASEPATH)
